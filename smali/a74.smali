.class public final synthetic La74;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le74;

.field public final synthetic c:Le74$b;


# direct methods
.method public synthetic constructor <init>(Le74;Le74$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La74;->b:Le74;

    iput-object p2, p0, La74;->c:Le74$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La74;->b:Le74;

    iget-object v1, p0, La74;->c:Le74$b;

    invoke-static {v0, v1}, Le74;->a(Le74;Le74$b;)V

    return-void
.end method
