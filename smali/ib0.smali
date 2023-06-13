.class public final synthetic Lib0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljb0;

.field public final synthetic c:Lic0;


# direct methods
.method public synthetic constructor <init>(Ljb0;Lic0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lib0;->b:Ljb0;

    iput-object p2, p0, Lib0;->c:Lic0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lib0;->b:Ljb0;

    iget-object v1, p0, Lib0;->c:Lic0;

    invoke-static {v0, v1}, Ljb0;->b(Ljb0;Lic0;)V

    return-void
.end method
