    Web based demo for the Shiratech LTE+sensors mezzanine board

    This simple demo shows how to collect data from various I2C sensors on the
M4 core of the STM32MP1 and visualize it on the A7 core. The current demo
implements a Web server for visualizing the data which then can be observed
remotely through a Web browser.

    For starting the demo one shall execute the following commands:
      # cd LTE_sensors_av96_dashboard/
      # ../fw_cortex_m4.sh start
            this starts the M4 firmware which will send sensor data
            periodically to Linux running on the A7 core
      # python3 app.py

    When app.py starts one can connect to the web server at address:
      http://<IP address of board>:5000

    The Avenger96 has 2 ethernet interfaces: one physical RJ45 connector and
one USB-Ethernet interface over X5 usb-otg connector. The former is called
"eth0" the later is "usb0". A DHCP client is running on eth0 which requests
IP address autometically when connected to a router. A DHCP server is running
on usb0 which will give a dynamic IP address for the PC when connected. The
IP address of usb0 interface is always 192.168.7.1.
    So when the board is connected to a PC through usb-ethernet collected
sensor data can be seen at:
      http://192.168.7.1:5000/


    Source code for the demo
    All the sources of the Python-based Web application can be found in this
image at /home/root/LTE_sensors_av96_dashboard
    C and C++ sources of the M4 firmware can be found at:
    https://github.com/bkardosa/meta-av96/tree/lte_demo/recipes-bsp/m4projects/files/Projects


    Rebuilding the image
    See: https://github.com/bkardosa/manifest-av96/tree/lte_demo

