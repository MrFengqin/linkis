/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.linkis.metadata.util;

import org.apache.linkis.common.conf.CommonVars;
import org.apache.linkis.common.conf.CommonVars$;

public class DWSConfig {

  public static CommonVars<String> HIVE_CONF_DIR =
      CommonVars$.MODULE$.apply(
          "hive.config.dir",
          CommonVars$.MODULE$.apply("HIVE_CONF_DIR", "/appcom/config/hadoop-config").getValue());
  public static CommonVars<String> HIVE_META_URL = CommonVars$.MODULE$.apply("hive.meta.url", "");
  public static CommonVars<String> HIVE_META_USER = CommonVars$.MODULE$.apply("hive.meta.user", "");
  public static CommonVars<String> HIVE_META_PASSWORD =
      CommonVars$.MODULE$.apply("hive.meta.password", "");

  // wds.linkis.metadata.hive.encode.enable配置HIVE BASE64加解密
  public static final CommonVars<Boolean> HIVE_PASS_ENCODE_ENABLED =
      CommonVars.apply("wds.linkis.metadata.hive.encode.enabled", false);

  public static CommonVars<Boolean> HIVE_PERMISSION_WITH_lOGIN_USER_ENABLED =
      CommonVars$.MODULE$.apply("linkis.metadata.hive.permission.with-login-user-enabled", true);

  public static final CommonVars<String> DB_FILTER_KEYWORDS =
      CommonVars.apply("wds.linkis.db.filter.keywords", "bak");

  public static final CommonVars<String> HIVE_DB_ADMIN_USER =
      CommonVars.apply("wds.linkis.metadata.hive.db.admin", "hadoop");

  public static final String HDFS_FILE_SYSTEM_REST_ERRS =
      CommonVars.apply(
              "wds.linkis.hdfs.rest.errs",
              ".*Filesystem closed.*|.*Failed to find any Kerberos tgt.*")
          .getValue();

  public static CommonVars<String> HIVE_SERVER2_URL =
      CommonVars$.MODULE$.apply("linkis.hive.server2.address", "jdbc:hive2://127.0.0.1:10000/");

  public static CommonVars<Boolean> HIVE_SERVER2_ENABLE =
      CommonVars$.MODULE$.apply("linkis.hive.server2.enable", false);
}
