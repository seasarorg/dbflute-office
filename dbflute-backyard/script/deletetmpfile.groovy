new File('../resource').eachFileRecurse{if (it.name ==~ /\..*\.html$/) it.delete()}
