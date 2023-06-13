.class public final LEu6$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEu6;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEu6$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"
    }
    d2 = {
        "LDf;",
        "text",
        "LA96;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:LEu6$a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LEu6$a$a;

    invoke-direct {v0}, LEu6$a$a;-><init>()V

    sput-object v0, LEu6$a$a;->b:LEu6$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final filter(LDf;)LA96;
    .locals 2

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LA96;

    sget-object v1, LHe3;->a:LHe3$a;

    invoke-virtual {v1}, LHe3$a;->a()LHe3;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LA96;-><init>(LDf;LHe3;)V

    return-object v0
.end method
