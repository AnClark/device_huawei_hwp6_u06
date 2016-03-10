/*
 * Copyright (C) 2013 Xiao-Long Chen <chenxiaolong@cxl.epac.to>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cyanogenmod.hardware;


import java.io.File;
import org.cyanogenmod.hardware.util.FileUtils;

 //* Glove mode / high touch sensitivity

public class HighTouchSensitivity {

    private static String GLOVE_PATH = "/sys/devices/platform/huawei_touch/touch_glove";

    public static boolean isSupported() { 
	File f = new File(GLOVE_PATH);
	return f.exists();
    }

    public static boolean isEnabled() { 
	int i;
	i = Integer.parseInt(FileUtils.readOneLine(GLOVE_PATH));
	return i == 1 ? true : false;
    }
 
    public static boolean setEnabled(boolean status) { 
	return FileUtils.writeLine(GLOVE_PATH, String.valueOf(status ? 1 : 0));
    }

}
