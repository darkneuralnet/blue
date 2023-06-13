.class public final synthetic LQC6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LRC6;

.field public final synthetic c:Lew5;


# direct methods
.method public synthetic constructor <init>(LRC6;Lew5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQC6;->b:LRC6;

    iput-object p2, p0, LQC6;->c:Lew5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LQC6;->b:LRC6;

    iget-object v1, p0, LQC6;->c:Lew5;

    invoke-static {v0, v1}, LRC6;->a(LRC6;Lew5;)V

    return-void
.end method
