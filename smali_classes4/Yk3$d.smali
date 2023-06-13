.class public final LYk3$d;
.super LcU2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYk3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "Yk3$d",
        "LcU2;",
        "LmV5;",
        "database",
        "",
        "a",
        "co.bird.android.lib.persistence.operator-filter.impl"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x5

    invoke-direct {p0, v0, v1}, LcU2;-><init>(II)V

    return-void
.end method


# virtual methods
.method public a(LmV5;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ALTER TABLE `operator_filter` RENAME TO `operator_option_filters`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `operator_toggle_filters` (\n  `id` TEXT PRIMARY KEY NOT NULL,\n  `kind` TEXT NOT NULL,\n  `ordinal_num` INTEGER NOT NULL,\n  `type` TEXT NOT NULL,\n  `title` TEXT NOT NULL,\n  `toggle_title` TEXT NOT NULL,\n  `enabled` INTEGER NOT NULL,\n  `icon` TEXT,\n  `icon_color` TEXT,\n  `colored_icon` TEXT,\n  `icon_background_color` TEXT\n)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    return-void
.end method
