.class public final synthetic Lo90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lpa0;

.field public final synthetic c:Lra0;


# direct methods
.method public synthetic constructor <init>(Lpa0;Lra0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo90;->b:Lpa0;

    iput-object p2, p0, Lo90;->c:Lra0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lo90;->b:Lpa0;

    iget-object v1, p0, Lo90;->c:Lra0;

    invoke-static {v0, v1}, Lr90$a;->f(Lpa0;Lra0;)V

    return-void
.end method
