.class public final synthetic LAm5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LWc0;

.field public final synthetic c:LCm5;


# direct methods
.method public synthetic constructor <init>(LWc0;LCm5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAm5;->b:LWc0;

    iput-object p2, p0, LAm5;->c:LCm5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LAm5;->b:LWc0;

    iget-object v1, p0, LAm5;->c:LCm5;

    invoke-static {v0, v1}, LCm5;->G(LWc0;LCm5;)V

    return-void
.end method
