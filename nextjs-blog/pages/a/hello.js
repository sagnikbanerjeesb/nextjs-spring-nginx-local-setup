import {useRouter} from "next/router";

export async function getServerSideProps({req}) {
    return {
        props: {

        }
    }
}

export default function Hello(props) {
    const router = useRouter();
    const queryVal = router.query['a'];

    console.log("Query val: " + queryVal);

    function updateQuery() {
        router.push({
            pathname: '/a/hello',
            query: {
                a: queryVal + 'c',
            }
        })
    }

    console.log('hello');
    return (
        <div>
            {props.text} {queryVal}
            <br/>
            <div onClick={updateQuery}>Update query</div>
        </div>
    )
}