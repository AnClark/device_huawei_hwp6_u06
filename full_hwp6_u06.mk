# Inherit m8-specific vendor tree
$(call inherit-product-if-exists, vendor/huawei/hwp6_u06/hwp6_u06-vendor.mk)

# Inherit from m8
$(call inherit-product, device/huawei/hwp6_u06/device_hwp6_u06.mk)
PRODUCT_NAME := full_hwp6_u06
PRODUCT_DEVICE := hwp6_u06
PRODUCT_BRAND := huawei
PRODUCT_MANUFACTURER := HUAWEI
PRODUCT_MODEL := P6-U06
