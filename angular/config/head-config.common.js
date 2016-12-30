/**
 * Configuration for head elements added during the creation of index.html.
 *
 * All href attributes are added the publicPath (if exists) by default.
 * You can explicitly hint to prefix a publicPath by setting a boolean value to a key that has
 * the same name as the attribute you want to operate on, but prefix with =
 *
 * Example:
 * { name: 'msapplication-TileImage', content: '/assets/icon/ms-icon-144x144.png', '=content': true },
 * Will prefix the publicPath to content.
 *
 * { rel: 'apple-touch-icon', sizes: '57x57', href: '/assets/icon/apple-icon-57x57.png', '=href': false },
 * Will not prefix the publicPath on href (href attributes are added by default
 *
 */
module.exports = {
    link: [
        /** <link> tags for 'apple-touch-icon' (AKA Web Clips). **/
        // { rel: 'apple-touch-icon', sizes: '180x180', href: '/assets/icon/apple-icon-180x180.png' },

        /** <link> tags for android web app icons **/
        // { rel: 'icon', type: 'image/png', sizes: '192x192', href: '/assets/icon/android-icon-192x192.png' },

        /** <link> tags for favicons **/
        // { rel: 'icon', type: 'image/png', sizes: '32x32', href: '/assets/icon/favicon-32x32.png' },

        /** <link> tags for a Web App Manifest **/
        // {rel: 'stylesheet', href: 'http://fonts.useso.com/css?family=Open+Sans:300,400', '=href': false},
        {rel: 'stylesheet', href: '/css/bootstrap.min.css', '=href': true},
        {rel: 'stylesheet', href: '/css/templatemo-style.css', '=href': true}
    ],
    meta: [
        // { name: 'msapplication-TileColor', content: '#00bcd4' },
        // { name: 'msapplication-TileImage', content: '/assets/icon/ms-icon-144x144.png', '=content': true },
        // { name: 'theme-color', content: '#00bcd4' }
    ],
    script: [
        {src: "/js/jquery-1.11.3.min.js", '=src': true},
        {src: "/js/tether.min.js", '=src': true},
        {src: "/js/bootstrap.min.js", '=src': true}
    ]
};
