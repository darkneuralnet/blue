.class public final synthetic LzC2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LAC2;


# direct methods
.method public synthetic constructor <init>(LAC2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzC2;->b:LAC2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LzC2;->b:LAC2;

    invoke-static {v0}, LAC2$a;->g(LAC2;)V

    return-void
.end method
