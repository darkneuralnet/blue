.class public final LA51$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA51$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA51;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "LA51$b;",
        "LA51$d;",
        "<init>",
        "()V",
        "co.bird.android.feature.self-serve-payment"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LA51$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LA51$b;

    invoke-direct {v0}, LA51$b;-><init>()V

    sput-object v0, LA51$b;->a:LA51$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
