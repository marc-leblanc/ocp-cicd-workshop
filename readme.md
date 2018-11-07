# Notes #
- Redhat openjdk builder image required.
Save https://gist.githubusercontent.com/tqvarnst/3ca512b01b7b7c1a1da0532939350e23/raw/3869a54c7dd960965f0e66907cdc3eba6d160cad/openjdk-s2i-imagestream.json
oc create -f openjdk-s2i-imagestream.json

# Steps # 
1) Create new project, call it tasks
2) Add MongoDB image , change db username to dbuser, db password to dbpassword and db name to test . Accept remaining as defaults
3) Add the RH s2i openjdk builder image (see notes)
4) Add to project -> Catalog -> Search for openjdk. When adding, add the following for the git repo address ( -- tbd --). Call this service backend. Wait for build to complete.
5) Add to project -> 
