.class public final synthetic Ld90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lr90;

.field public final synthetic c:Lpa0;


# direct methods
.method public synthetic constructor <init>(Lr90;Lpa0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld90;->b:Lr90;

    iput-object p2, p0, Ld90;->c:Lpa0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ld90;->b:Lr90;

    iget-object v1, p0, Ld90;->c:Lpa0;

    invoke-static {v0, v1}, Lr90;->m(Lr90;Lpa0;)V

    return-void
.end method
