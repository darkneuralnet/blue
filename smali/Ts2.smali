.class public final synthetic LTs2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LUs2$a;

.field public final synthetic c:LUs2$b;


# direct methods
.method public synthetic constructor <init>(LUs2$a;LUs2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTs2;->b:LUs2$a;

    iput-object p2, p0, LTs2;->c:LUs2$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LTs2;->b:LUs2$a;

    iget-object v1, p0, LTs2;->c:LUs2$b;

    invoke-static {v0, v1}, LUs2$a;->a(LUs2$a;LUs2$b;)V

    return-void
.end method
