.class public final synthetic LKD2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRD2$b;


# instance fields
.field public final synthetic a:LRD2;

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(LRD2;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKD2;->a:LRD2;

    iput p2, p0, LKD2;->b:F

    return-void
.end method


# virtual methods
.method public final a(LrD2;)V
    .locals 2

    iget-object v0, p0, LKD2;->a:LRD2;

    iget v1, p0, LKD2;->b:F

    invoke-static {v0, v1, p1}, LRD2;->d(LRD2;FLrD2;)V

    return-void
.end method
