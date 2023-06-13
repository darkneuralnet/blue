.class public final LvN2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0080\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u000e\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00010\u0000\"\u0008\u0008\u0001\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00010\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0002\u001aA\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u000e\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00010\u0000\"\u0008\u0008\u0001\u0010\u0003*\u00020\u00022\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0010\u001a\u00028\u0001H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "LRN2;",
        "VM",
        "LAN2;",
        "S",
        "Ljava/lang/Class;",
        "declaredViewModelClass",
        "declaredStateClass",
        "LPr6;",
        "viewModelContext",
        "LIP5;",
        "stateRestorer",
        "LBN2;",
        "initialStateFactory",
        "LaO2;",
        "c",
        "viewModelClass",
        "state",
        "b",
        "(Ljava/lang/Class;LAN2;)LRN2;",
        "mvrx_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final synthetic a(Ljava/lang/Class;Ljava/lang/Class;LPr6;LIP5;LBN2;)LaO2;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LvN2;->c(Ljava/lang/Class;Ljava/lang/Class;LPr6;LIP5;LBN2;)LaO2;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Class;LAN2;)LRN2;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "LRN2<",
            "TS;>;S::",
            "LAN2;",
            ">(",
            "Ljava/lang/Class<",
            "TVM;>;TS;)TVM;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    array-length v3, v3

    if-ne v3, v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    aget-object v3, v3, v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v3

    if-nez v3, :cond_0

    :try_start_0
    invoke-virtual {p0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ViewModel class is not public and Mavericks could not make the primary constructor accessible."

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_0
    :goto_0
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v0

    invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, LRN2;

    if-eqz p1, :cond_1

    move-object v1, p0

    check-cast v1, LRN2;

    :cond_1
    return-object v1
.end method

.method public static final c(Ljava/lang/Class;Ljava/lang/Class;LPr6;LIP5;LBN2;)LaO2;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "LRN2<",
            "TS;>;S::",
            "LAN2;",
            ">(",
            "Ljava/lang/Class<",
            "+TVM;>;",
            "Ljava/lang/Class<",
            "+TS;>;",
            "LPr6;",
            "LIP5<",
            "TVM;TS;>;",
            "LBN2<",
            "TVM;TS;>;)",
            "LaO2<",
            "TVM;TS;>;"
        }
    .end annotation

    const-class v0, LAN2;

    const-class v1, LPr6;

    const-string v2, "create"

    invoke-interface {p4, p0, p1, p2, p3}, LBN2;->a(Ljava/lang/Class;Ljava/lang/Class;LPr6;LIP5;)LAN2;

    move-result-object p4

    if-eqz p3, :cond_1

    invoke-virtual {p3}, LIP5;->c()Ljava/lang/Class;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v3

    :cond_1
    :goto_0
    if-eqz p3, :cond_3

    invoke-virtual {p3}, LIP5;->a()Ljava/lang/Class;

    move-result-object p3

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    move-object p1, p3

    :cond_3
    :goto_1
    invoke-static {p0}, LZN2;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz p3, :cond_4

    const/4 v6, 0x2

    :try_start_0
    new-array v7, v6, [Ljava/lang/Class;

    aput-object v1, v7, v4

    aput-object v0, v7, v5

    invoke-virtual {p3, v2, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-static {p3}, LZN2;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    new-array v8, v6, [Ljava/lang/Object;

    aput-object p2, v8, v4

    aput-object p4, v8, v5

    invoke-virtual {v7, p3, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LRN2;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, p3

    goto :goto_2

    :catch_0
    new-array p3, v6, [Ljava/lang/Class;

    aput-object v1, p3, v4

    aput-object v0, p3, v5

    invoke-virtual {p0, v2, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p2, v0, v4

    aput-object p4, v0, v5

    invoke-virtual {p3, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LRN2;

    move-object v3, p2

    :cond_4
    :goto_2
    if-nez v3, :cond_5

    invoke-static {p0, p4}, LvN2;->b(Ljava/lang/Class;LAN2;)LRN2;

    move-result-object v3

    :cond_5
    if-nez v3, :cond_9

    invoke-virtual {p0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object p2

    const-string p3, "viewModelClass.constructors"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/collections/ArraysKt;->firstOrNull([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/reflect/Constructor;

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p2

    if-eqz p2, :cond_7

    array-length p2, p2

    if-le p2, v5, :cond_6

    move p2, v5

    goto :goto_3

    :cond_6
    move p2, v4

    :goto_3
    if-ne p2, v5, :cond_7

    move v4, v5

    :cond_7
    if-eqz v4, :cond_8

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " takes dependencies other than initialState. It must have companion object implementing "

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class p0, LWN2;

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " with a create method returning a non-null ViewModel."

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_4

    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " must have primary constructor with a single non-optional parameter that takes initial state of "

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2e

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p0, LaO2;

    invoke-direct {p0, v3}, LaO2;-><init>(LRN2;)V

    return-object p0
.end method
