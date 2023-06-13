.class public final synthetic LwM4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LuM4$e;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LuM4$e;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwM4;->b:LuM4$e;

    iput p2, p0, LwM4;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LwM4;->b:LuM4$e;

    iget v1, p0, LwM4;->c:I

    invoke-static {v0, v1}, LuM4$e;->a(LuM4$e;I)V

    return-void
.end method
