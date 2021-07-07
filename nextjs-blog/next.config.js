const { PHASE_DEVELOPMENT_SERVER } = require('next/constants')

module.exports = (phase, { defaultConfig }) => {
  return {
    basePath: '/base',
    // assetPrefix: '/base',
    rewrites: []
  }
}
