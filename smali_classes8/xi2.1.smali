.class public abstract Lxi2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
    with = LBi2;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxi2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0003\u0006\u0007\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lxi2;",
        "",
        "<init>",
        "()V",
        "Companion",
        "a",
        "Lei2;",
        "LSi2;",
        "LYi2;",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lxi2$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxi2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxi2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxi2;->Companion:Lxi2$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lxi2;-><init>()V

    return-void
.end method
