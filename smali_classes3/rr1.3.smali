.class public final synthetic Lrr1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ltr1;


# direct methods
.method public synthetic constructor <init>(Ltr1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr1;->b:Ltr1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lrr1;->b:Ltr1;

    invoke-static {v0}, Ltr1;->Sl(Ltr1;)V

    return-void
.end method
