<html>
    <head>
        <title>Spock Web Console - Script</title>

        <link rel="alternate"
                type="application/atom+xml"
                href="/atom.groovy"
                title="Spock Web Console Scripts Atom Feed"
        />

        <link rel="stylesheet" type="text/css" href="/css/redmond/jquery-ui-1.7.1.custom.css"/>
        <link rel="stylesheet" type="text/css" href="/css/main.css"/>
    </head>

    <body>
        <h1><a href="/">Spock Web Console</a></h1>

        <table cellspacing="20" style="float:right">
            <tr>
                <td>
                    <a id="atomLink" href="/atom.groovy">
                        <table>
                            <tr>
                                <td><img src="/images/atom-feed.png" alt="subscribe to the feed" align="left" border="0"></td>
                                <td><i>Subscribe</i></td>
                            </tr>
                        </table>
                    </a>
                </td>
            </tr>
        </table>

        <div>
            <h2>No such script!</h2>

            <div id="actionsBreadcrumb">
                <span class="actionsBreadcrumbHead">Actions &nbsp;&#x27A4;</span>
                <span class="actionsBreadcrumbChild"><a href="/">Back To Console</a></span>
                <span class="actionsBreadcrumbLastChild"><a href="/recentscripts.gtpl?limit=40">View Recent Scripts</a></span>
            </div>
        </div>

        <% include '/WEB-INF/includes/about.gtpl' %>
    </body>
</html>