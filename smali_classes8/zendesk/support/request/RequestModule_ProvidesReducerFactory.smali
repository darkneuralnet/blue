.class public final Lzendesk/support/request/RequestModule_ProvidesReducerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/request/RequestModule_ProvidesReducerFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ljava/util/List<",
        "Lzendesk/support/suas/Reducer;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lzendesk/support/request/RequestModule_ProvidesReducerFactory;
    .locals 1

    invoke-static {}, Lzendesk/support/request/RequestModule_ProvidesReducerFactory$InstanceHolder;->access$000()Lzendesk/support/request/RequestModule_ProvidesReducerFactory;

    move-result-object v0

    return-object v0
.end method

.method public static providesReducer()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzendesk/support/suas/Reducer;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lzendesk/support/request/RequestModule;->providesReducer()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/request/RequestModule_ProvidesReducerFactory;->get()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzendesk/support/suas/Reducer;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lzendesk/support/request/RequestModule_ProvidesReducerFactory;->providesReducer()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
