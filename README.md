# 不详之兆药水 (Potion of Bad Omen)

一个为 Minecraft 1.21.11 制作的 Fabric 模组，添加了可通过酿造获得的不详之兆药水。

## 功能

- 新增**不详之兆药水**：饮用后会持续施加不详之兆（Bad Omen）状态效果
- 酿造配方：粗制药水 + 白色旗帜 → 不详之兆药水

## 酿造配方

```
粗制药水 (Awkward Potion) + 白色旗帜 (White Banner) = 不详之兆药水
```

在酿造台中，将白色旗帜放入材料槽，粗制药水放入底部药水槽即可合成。

## 安装

1. 安装 [Fabric Loader](https://fabricmc.net/use/) >= 0.18.4
2. 安装 [Fabric API](https://modrinth.com/mod/fabric-api)
3. 将 `potionofbadomen-1.0.0.jar` 放入 `.minecraft/mods/` 目录
4. 启动游戏

## 环境要求

| 依赖 | 版本 |
|------|------|
| Minecraft | 1.21.11 |
| Fabric Loader | >= 0.18.4 |
| Fabric API | 0.141.3+1.21.11 |
| Java | >= 21 |

## 构建

```bash
./gradlew build
```

构建产物位于 `build/libs/` 目录。

## 作者

- HMS Indomitable
- Awayuki

## 许可证

[CC0-1.0](https://creativecommons.org/publicdomain/zero/1.0/)
