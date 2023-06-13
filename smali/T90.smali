.class public final synthetic LT90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LP90$d;


# direct methods
.method public synthetic constructor <init>(LP90$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT90;->b:LP90$d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LT90;->b:LP90$d;

    invoke-interface {v0}, LP90$d;->c()V

    return-void
.end method
