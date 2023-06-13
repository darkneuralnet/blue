.class public final LNM$f;
.super LcU2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNM;
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
        "NM$f",
        "LcU2;",
        "LmV5;",
        "database",
        "",
        "a",
        "co.bird.android.lib.persistence.bird.impl"
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

    const-string v0, "DROP TABLE IF EXISTS `bird`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "\n      CREATE TABLE IF NOT EXISTS `bird` (\n        `id` TEXT NOT NULL, \n        `model` TEXT,\n        `task_id` TEXT,\n        `battery_level` INTEGER NOT NULL,\n        `estimated_range` INTEGER,\n        `distance` INTEGER NOT NULL,\n        `location` TEXT NOT NULL,\n        `code` TEXT NOT NULL,\n        `sticker_id` TEXT,\n        `serial_number` TEXT NOT NULL,\n        `disconnected` INTEGER NOT NULL,\n        `accident` INTEGER NOT NULL,\n        `submerged` INTEGER NOT NULL,\n        `lost` INTEGER NOT NULL,\n        `locked` INTEGER NOT NULL,\n        `ack_locked` INTEGER NOT NULL,\n        `captive` INTEGER NOT NULL,\n        `gps_fix` INTEGER NOT NULL,\n        `broken` INTEGER NOT NULL,\n        `label` TEXT NOT NULL,\n        `actions` TEXT NOT NULL,\n        `bounty_id` TEXT,\n        `bounty_price` INTEGER,\n        `bounty_currency` TEXT NOT NULL,\n        `bounty_lost` INTEGER NOT NULL,\n        `bounty_overdue` INTEGER NOT NULL,\n        `bounty_kind` TEXT NOT NULL,\n        `brand_name` TEXT,\n        `task_kind` TEXT NOT NULL,\n        `gps_at` TEXT,\n        `tracked_at` TEXT,\n        `token` TEXT,\n        `bluetooth` INTEGER NOT NULL,\n        `cellular` INTEGER NOT NULL,\n        `started_at` TEXT,\n        `due_at` TEXT,\n        `asleep` INTEGER NOT NULL,\n        `imei` TEXT,\n        `board_protocol` TEXT,\n        `physical_lock` TEXT,\n        `priority_collect` INTEGER NOT NULL,\n        `down` INTEGER NOT NULL,\n        `needs_inspection` INTEGER NOT NULL,\n        `partner_id` TEXT,\n        `nest_id` TEXT,\n        `last_ride_ended_at` TEXT,\n        `partner_bird_state` TEXT,\n        `peril` INTEGER NOT NULL,\n        `deliverable` INTEGER NOT NULL,\n        `lifecycle` TEXT NOT NULL,\n        `offline` INTEGER NOT NULL,\n        `license` TEXT,\n        `area_key` TEXT,\n        `nest_purpose` TEXT,\n        `private_bird` TEXT,\n        `scanned_at` TEXT,\n        `badge_type` TEXT NOT NULL,\n        `bounty_reasons` TEXT NOT NULL,\n        `ephemeral_id` TEXT,\n        PRIMARY KEY(`id`)\n      )\n    "

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    return-void
.end method
