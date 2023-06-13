.class public final synthetic LSs2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LUs2;

.field public final synthetic c:LO80$a;


# direct methods
.method public synthetic constructor <init>(LUs2;LO80$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSs2;->b:LUs2;

    iput-object p2, p0, LSs2;->c:LO80$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LSs2;->b:LUs2;

    iget-object v1, p0, LSs2;->c:LO80$a;

    invoke-static {v0, v1}, LUs2;->f(LUs2;LO80$a;)V

    return-void
.end method
