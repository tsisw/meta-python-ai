SUMMARY = "The low-level, core functionality of boto 3."
HOMEPAGE = "https://github.com/boto/botocore"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI[sha256sum] = "502ddafe1d627fcf1e4c007c86454e5dd011dba7c58bd8e8a5368a79f3e387dc"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
	python3-jmespath \
	python3-dateutil \
	python3-urllib3 \
"
