.class public final synthetic Lj90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lr90;


# direct methods
.method public synthetic constructor <init>(Lr90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj90;->b:Lr90;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lj90;->b:Lr90;

    invoke-static {v0}, Lr90;->p(Lr90;)V

    return-void
.end method
