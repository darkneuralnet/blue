.class public final synthetic LR01;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/J;


# instance fields
.field public final synthetic a:LZ01;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LZ01;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR01;->a:LZ01;

    iput-object p2, p0, LR01;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/H;)V
    .locals 2

    iget-object v0, p0, LR01;->a:LZ01;

    iget-object v1, p0, LR01;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, LZ01;->l(LZ01;Ljava/lang/String;Lio/reactivex/H;)V

    return-void
.end method
