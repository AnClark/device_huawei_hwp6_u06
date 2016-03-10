# Release name
PRODUCT_RELEASE_NAME := P6-U06

# bootanimation target
TARGET_SCREEN_HEIGHT := 1280
TARGET_SCREEN_WIDTH := 720

# Inherit some common CM stuff.
$(call inherit-product, vendor/carbon/config/common_phone.mk)

# Inherit device configuration
$(call inherit-product, device/huawei/hwp6_u06/full_hwp6_u06.mk)


## Device identifier. This must come after all inclusions
PRODUCT_NAME := carbon_hwp6_u06



