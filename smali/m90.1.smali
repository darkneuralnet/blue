.class public final synthetic Lm90;
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

    iput-object p1, p0, Lm90;->b:Lr90;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lm90;->b:Lr90;

    invoke-virtual {v0}, Lr90;->n0()J

    return-void
.end method
