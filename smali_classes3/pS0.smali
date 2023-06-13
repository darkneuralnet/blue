.class public final synthetic LpS0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LoS0;


# direct methods
.method public synthetic constructor <init>(LoS0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpS0;->b:LoS0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LpS0;->b:LoS0;

    invoke-static {v0}, LoS0$c;->a(LoS0;)V

    return-void
.end method
