.class public final synthetic LFg1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LBg1;

.field public final synthetic c:Lg70;


# direct methods
.method public synthetic constructor <init>(LBg1;Lg70;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFg1;->b:LBg1;

    iput-object p2, p0, LFg1;->c:Lg70;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LFg1;->b:LBg1;

    iget-object v1, p0, LFg1;->c:Lg70;

    invoke-static {v0, v1}, LGg1;->e(LBg1;Lg70;)V

    return-void
.end method
