.class public final synthetic LJq2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/q;


# instance fields
.field public final synthetic b:Ljava/util/Comparator;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Comparator;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJq2;->b:Ljava/util/Comparator;

    iput-object p2, p0, LJq2;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, LJq2;->b:Ljava/util/Comparator;

    iget-object v1, p0, LJq2;->c:Ljava/lang/Object;

    invoke-static {v0, v1, p1}, Lcom/uber/autodispose/lifecycle/LifecycleScopes;->a(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
