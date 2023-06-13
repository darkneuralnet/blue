.class public final Lgg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0003\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0002\u001a\u0004\u0008\u0005\u0010\u0003\"\u0017\u0010\u0008\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0002\u001a\u0004\u0008\u0007\u0010\u0003\u00a8\u0006\t"
    }
    d2 = {
        "LcU2;",
        "a",
        "LcU2;",
        "()LcU2;",
        "ANNOUNCEMENT_MIGRATION_1_2",
        "b",
        "ANNOUNCEMENT_MIGRATION_2_3",
        "c",
        "ANNOUNCEMENT_MIGRATION_3_4",
        "co.bird.android.lib.persistence.announcements.impl"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LcU2;

.field public static final b:LcU2;

.field public static final c:LcU2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgg$a;

    invoke-direct {v0}, Lgg$a;-><init>()V

    sput-object v0, Lgg;->a:LcU2;

    new-instance v0, Lgg$b;

    invoke-direct {v0}, Lgg$b;-><init>()V

    sput-object v0, Lgg;->b:LcU2;

    new-instance v0, Lgg$c;

    invoke-direct {v0}, Lgg$c;-><init>()V

    sput-object v0, Lgg;->c:LcU2;

    return-void
.end method

.method public static final a()LcU2;
    .locals 1

    sget-object v0, Lgg;->a:LcU2;

    return-object v0
.end method

.method public static final b()LcU2;
    .locals 1

    sget-object v0, Lgg;->b:LcU2;

    return-object v0
.end method

.method public static final c()LcU2;
    .locals 1

    sget-object v0, Lgg;->c:LcU2;

    return-object v0
.end method
