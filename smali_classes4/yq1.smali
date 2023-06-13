.class public final Lyq1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0013\"\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0001\u0010\t\"\u0017\u0010\u000c\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0008\u001a\u0004\u0008\u0007\u0010\t\"\u0017\u0010\u000e\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0008\u001a\u0004\u0008\u000b\u0010\t\"\u0017\u0010\u0010\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0008\u001a\u0004\u0008\r\u0010\t\"\u0017\u0010\u0013\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0008\u001a\u0004\u0008\u0012\u0010\t\"\u0017\u0010\u0015\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0008\u001a\u0004\u0008\u000f\u0010\t\"\u0017\u0010\u0016\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0008\u001a\u0004\u0008\u0011\u0010\t\"\u0017\u0010\u0018\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0008\u001a\u0004\u0008\u0014\u0010\t\u00a8\u0006\u0019"
    }
    d2 = {
        "",
        "a",
        "Ljava/lang/String;",
        "h",
        "()Ljava/lang/String;",
        "THEMED_COLORS_DEFAULT",
        "LcU2;",
        "b",
        "LcU2;",
        "()LcU2;",
        "FLEET_STATUS_MIGRATION_1_2",
        "c",
        "FLEET_STATUS_MIGRATION_2_3",
        "d",
        "FLEET_STATUS_MIGRATION_3_4",
        "e",
        "FLEET_STATUS_MIGRATION_4_5",
        "f",
        "getFLEET_STATUS_MIGRATION_5_6",
        "FLEET_STATUS_MIGRATION_5_6",
        "g",
        "FLEET_STATUS_MIGRATION_6_7",
        "FLEET_STATUS_MIGRATION_7_8",
        "i",
        "FLEET_STATUS_MIGRATION_8_9",
        "co.bird.android.lib.persistence.fleet-status.impl"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:LcU2;

.field public static final c:LcU2;

.field public static final d:LcU2;

.field public static final e:LcU2;

.field public static final f:LcU2;

.field public static final g:LcU2;

.field public static final h:LcU2;

.field public static final i:LcU2;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->n(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lyq1;->a:Ljava/lang/String;

    new-instance v0, Lyq1$a;

    invoke-direct {v0}, Lyq1$a;-><init>()V

    sput-object v0, Lyq1;->b:LcU2;

    new-instance v0, Lyq1$b;

    invoke-direct {v0}, Lyq1$b;-><init>()V

    sput-object v0, Lyq1;->c:LcU2;

    new-instance v0, Lyq1$c;

    invoke-direct {v0}, Lyq1$c;-><init>()V

    sput-object v0, Lyq1;->d:LcU2;

    new-instance v0, Lyq1$d;

    invoke-direct {v0}, Lyq1$d;-><init>()V

    sput-object v0, Lyq1;->e:LcU2;

    new-instance v0, Lyq1$e;

    invoke-direct {v0}, Lyq1$e;-><init>()V

    sput-object v0, Lyq1;->f:LcU2;

    new-instance v0, Lyq1$f;

    invoke-direct {v0}, Lyq1$f;-><init>()V

    sput-object v0, Lyq1;->g:LcU2;

    new-instance v0, Lyq1$g;

    invoke-direct {v0}, Lyq1$g;-><init>()V

    sput-object v0, Lyq1;->h:LcU2;

    new-instance v0, Lyq1$h;

    invoke-direct {v0}, Lyq1$h;-><init>()V

    sput-object v0, Lyq1;->i:LcU2;

    return-void
.end method

.method public static final a()LcU2;
    .locals 1

    sget-object v0, Lyq1;->b:LcU2;

    return-object v0
.end method

.method public static final b()LcU2;
    .locals 1

    sget-object v0, Lyq1;->c:LcU2;

    return-object v0
.end method

.method public static final c()LcU2;
    .locals 1

    sget-object v0, Lyq1;->d:LcU2;

    return-object v0
.end method

.method public static final d()LcU2;
    .locals 1

    sget-object v0, Lyq1;->e:LcU2;

    return-object v0
.end method

.method public static final e()LcU2;
    .locals 1

    sget-object v0, Lyq1;->g:LcU2;

    return-object v0
.end method

.method public static final f()LcU2;
    .locals 1

    sget-object v0, Lyq1;->h:LcU2;

    return-object v0
.end method

.method public static final g()LcU2;
    .locals 1

    sget-object v0, Lyq1;->i:LcU2;

    return-object v0
.end method

.method public static final h()Ljava/lang/String;
    .locals 1

    sget-object v0, Lyq1;->a:Ljava/lang/String;

    return-object v0
.end method
