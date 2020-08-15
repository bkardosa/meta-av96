SUMMARY = "OpenSTLinux weston image with basic Wayland support (if enable in distro)."
LICENSE = "Proprietary"

include recipes-st/images/st-image-weston.bb

IMAGE_INSTALL += "dhcp-server \
                  openssl \
                  openssl-bin \
                  tpm2-tools \
                  libtss2 \
                  trousers \
                  tpm2-tss-engine \
                  stress-ng \
                  av96-root-files \
                  python3 \
                  python3-pip \
                  python3-pyserial \
                  git \
                  packagegroup-core-buildessential \
                  python3-flask-socketio \
                  lte-sensors-dashboard \
                  "

