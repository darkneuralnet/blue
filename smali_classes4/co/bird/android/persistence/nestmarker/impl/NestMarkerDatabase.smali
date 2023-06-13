.class public abstract Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase;
.super LEb5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\'\u0018\u0000 \u00082\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\n"
    }
    d2 = {
        "Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase;",
        "LEb5;",
        "Le43;",
        "C",
        "()Le43;",
        "nestMarkerDao",
        "<init>",
        "()V",
        "p",
        "e",
        "co.bird.android.lib.persistence.nestmarker.impl"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final p:Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$e;

.field public static final q:LcU2;

.field public static final r:LcU2;

.field public static final s:LcU2;

.field public static final t:LcU2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase;->p:Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$e;

    new-instance v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$a;

    invoke-direct {v0}, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$a;-><init>()V

    sput-object v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase;->q:LcU2;

    new-instance v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$b;

    invoke-direct {v0}, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$b;-><init>()V

    sput-object v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase;->r:LcU2;

    new-instance v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$c;

    invoke-direct {v0}, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$c;-><init>()V

    sput-object v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase;->s:LcU2;

    new-instance v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$d;

    invoke-direct {v0}, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$d;-><init>()V

    sput-object v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase;->t:LcU2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LEb5;-><init>()V

    return-void
.end method

.method public static final synthetic access$getMIGRATION_1_2$cp()LcU2;
    .locals 1

    sget-object v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase;->q:LcU2;

    return-object v0
.end method

.method public static final synthetic access$getMIGRATION_2_3$cp()LcU2;
    .locals 1

    sget-object v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase;->r:LcU2;

    return-object v0
.end method

.method public static final synthetic access$getMIGRATION_3_4$cp()LcU2;
    .locals 1

    sget-object v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase;->s:LcU2;

    return-object v0
.end method

.method public static final synthetic access$getMIGRATION_4_5$cp()LcU2;
    .locals 1

    sget-object v0, Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase;->t:LcU2;

    return-object v0
.end method


# virtual methods
.method public abstract C()Le43;
.end method
