.class public final synthetic Lp90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lpa0;


# direct methods
.method public synthetic constructor <init>(Lpa0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp90;->b:Lpa0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lp90;->b:Lpa0;

    invoke-static {v0}, Lr90$a;->e(Lpa0;)V

    return-void
.end method
