.class Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider$UntilEventFunction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UntilEventFunction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
        "Landroidx/lifecycle/f$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Landroidx/lifecycle/f$a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider$UntilEventFunction;->b:Landroidx/lifecycle/f$a;

    return-void
.end method


# virtual methods
.method public a(Landroidx/lifecycle/f$a;)Landroidx/lifecycle/f$a;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/uber/autodispose/OutsideScopeException;
        }
    .end annotation

    iget-object p1, p0, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider$UntilEventFunction;->b:Landroidx/lifecycle/f$a;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/uber/autodispose/OutsideScopeException;
        }
    .end annotation

    check-cast p1, Landroidx/lifecycle/f$a;

    invoke-virtual {p0, p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider$UntilEventFunction;->a(Landroidx/lifecycle/f$a;)Landroidx/lifecycle/f$a;

    move-result-object p1

    return-object p1
.end method
