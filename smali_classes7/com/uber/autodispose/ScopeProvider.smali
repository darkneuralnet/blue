.class public interface abstract Lcom/uber/autodispose/ScopeProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g0:Lcom/uber/autodispose/ScopeProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LVm5;

    invoke-direct {v0}, LVm5;-><init>()V

    sput-object v0, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method


# virtual methods
.method public abstract T0()Lio/reactivex/h;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method
