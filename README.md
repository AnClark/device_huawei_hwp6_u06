# Device tree for Huawei Ascent P6

This repository is the device tree for Huawei Ascent P6, the former leadership of Huawei in 2013, and also the first generation with Hisilicon SoC. It's a real milestone, so it deserves a new Android port.

<big>My target is Android 8.1!</big>

## Features

- Ready-to-use. Currently you can directly use it to build TWRP 3.2.3 with Omni 8.1 source.
- Works well with Omni 8.1 source while building TWRP.
- Not sure what can/cannot work if I build a ready-to-use ROM (I'm busy these days...).
- Includes a toolchain for building kernel.

## Works with TWRP

### What Works

- Can normally boot into TWRP
- The UI goes pretty well!
- ROM flashing
- Internal Storage reserving (`/data/media/0`) when factory resets
- MTP support
- SD Card access
- OTG support (USB storages are treated as SCSI devices, so you have to manually mount via `mount /dev/sda1 /otg`)
- Full ADB access via FunctionFS!

## TODO

- TWRP
  - ADB access is not available. But when I use the same kernel at any former recoveries (e.g. ATX's CWM), ADB works quite well. So maybe it's TWRP's issue.
- root/init.rc: 
  - Custom init.rc may not be applied
  - SELinux context issue may occur
- recovery/ueventd.rc
  - May occur compatibility issue

## How to Build

1. Download Omni 8.1 source. [Follow this guide](https://github.com/omnirom/android#getting-started) but replace `android-9.0` with `android-8.1`. You can also try the newest `android-9.0`.
2. Clone the [kernel source](https://github.com/AnClark/kernel-huawei-p6) into Omni source's `kernel/hwp6_u06` folder.
3. Run the following commands in Omni source's root:
  ```
  source build/envsetup.sh
  lunch hwp6_u06-userdebug
  make recoveryimage
  ```
4. When succeed, you will get the built recovery image on the bottom of stdout.

## NOTICE

Huawei P6 is an early leadership model, so it has an ancient kernel which **MUST BE BUILT WITH AN OLDER TOOLCHAIN**, or it will stuck at boot! But don't worry, the toolchain is well-prepared in this repo, so you needn't to configure yourself.

## Credits

This device tree is migrated from OmniROM Kitkat configuration maintained by @marlintoe.