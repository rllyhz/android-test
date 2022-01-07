/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.test.platform.device;

/**
 * Provides base-level device operations that can be used to build user actions such as folding a
 * device, changing screen orientation etc. It provides a advanced synchronization mechanism for
 * test actions.
 */
public interface DeviceController {
  /**
   * Sets the connected device to the provided mode. unsupported device mode.
   *
   * @param deviceMode the mode to put the device in
   */
  void setDeviceMode(int deviceMode);

  /**
   * Sets the connected device to the provided screen orientation.
   *
   * @param screenOrientation the orientation to put the device in
   */
  void setScreenOrientation(int screenOrientation);

  /** Enum for screen orientations a device can be set to. */
  enum ScreenOrientation {
    PORTRAIT,
    LANDSCAPE
  }
}
