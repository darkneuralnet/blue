.class public final synthetic LIy0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/g;


# instance fields
.field public final synthetic b:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIy0;->b:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LIy0;->b:Ljava/util/Set;

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-static {v0, p1}, LLy0;->b(Ljava/util/Set;Lio/reactivex/disposables/c;)V

    return-void
.end method
