# 项目说明

"不详之兆药水" (Potion of Bad Omen) — Minecraft Fabric 模组，MC 1.21.11。

- 酿造配方：粗制药水 + 白色旗帜
- 效果持续 2000 ticks（100秒）
- 作者：HMS Indomitable, Awayuki
- 许可：CC0-1.0
- GitHub：https://github.com/CVIndomitable/potionofbadomen.git

## 依赖版本

| 依赖 | 版本 |
|------|------|
| Minecraft | 1.21.11 |
| Fabric Loader | 0.18.4 |
| Fabric API | 0.141.3+1.21.11 |
| Yarn | 1.21.11+build.4 |
| Fabric Loom | 1.13.6 |
| Gradle | 8.14 |
| Java | 21 |

## 构建

MC 1.21+ 需要 Java 21，系统默认可能是 Java 17，必须显式指定：

```bash
JAVA_HOME=/Library/Java/JavaVirtualMachines/zulu-21.jdk/Contents/Home ./gradlew build
```

如需代理（通过 JAVA_OPTS 传递，仅 `-D` 参数不够）：

```bash
JAVA_HOME=/Library/Java/JavaVirtualMachines/zulu-21.jdk/Contents/Home \
JAVA_OPTS="-Dhttp.proxyHost=127.0.0.1 -Dhttp.proxyPort=7897 -Dhttps.proxyHost=127.0.0.1 -Dhttps.proxyPort=7897" \
./gradlew build
```

## 相关项目

NeoForge 版：`/Users/lianran/apps/不详之兆药水-neoforge/`（MC 1.21.11, NeoForge 21.11.38-beta）
修改模组功能时需同时更新两个版本。
