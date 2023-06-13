.class public final LUi$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/GraphRequest$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUi;->i(LE1;Luv5;ZLqv1;)Lcom/facebook/GraphRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LWD1;",
        "response",
        "",
        "a",
        "(LWD1;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:LE1;

.field public final synthetic b:Lcom/facebook/GraphRequest;

.field public final synthetic c:Luv5;

.field public final synthetic d:Lqv1;


# direct methods
.method public constructor <init>(LE1;Lcom/facebook/GraphRequest;Luv5;Lqv1;)V
    .locals 0

    iput-object p1, p0, LUi$b;->a:LE1;

    iput-object p2, p0, LUi$b;->b:Lcom/facebook/GraphRequest;

    iput-object p3, p0, LUi$b;->c:Luv5;

    iput-object p4, p0, LUi$b;->d:Lqv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWD1;)V
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LUi$b;->a:LE1;

    iget-object v1, p0, LUi$b;->b:Lcom/facebook/GraphRequest;

    iget-object v2, p0, LUi$b;->c:Luv5;

    iget-object v3, p0, LUi$b;->d:Lqv1;

    invoke-static {v0, v1, p1, v2, v3}, LUi;->n(LE1;Lcom/facebook/GraphRequest;LWD1;Luv5;Lqv1;)V

    return-void
.end method
