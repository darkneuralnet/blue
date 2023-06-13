.class public LLY0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLY0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static a:LZU5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZU5<",
            "LUV5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LKY0;

    invoke-direct {v0}, LKY0;-><init>()V

    sput-object v0, LLY0$a;->a:LZU5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LUV5;
    .locals 1

    sget-object v0, LLY0$a;->a:LZU5;

    invoke-interface {v0}, LZU5;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUV5;

    return-object v0
.end method
