import {useRouter} from "next/router";

export default function B(props) {
    const router = useRouter();
    return (
        <div>
            B: {router.query.id}
        </div>
    )
}
