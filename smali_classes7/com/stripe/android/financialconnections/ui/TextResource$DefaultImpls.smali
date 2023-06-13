.class public final Lcom/stripe/android/financialconnections/ui/TextResource$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/ui/TextResource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTextResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextResource.kt\ncom/stripe/android/financialconnections/ui/TextResource$DefaultImpls\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n76#2:41\n1804#3,4:42\n*S KotlinDebug\n*F\n+ 1 TextResource.kt\ncom/stripe/android/financialconnections/ui/TextResource$DefaultImpls\n*L\n33#1:41\n32#1:42,4\n*E\n"
    }
.end annotation


# direct methods
.method public static toText(Lcom/stripe/android/financialconnections/ui/TextResource;LEt0;I)Ljava/lang/CharSequence;
    .locals 7

    const v0, 0x7abf1718

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.TextResource.toText (TextResource.kt:23)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    instance-of p2, p0, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    if-eqz p2, :cond_1

    check-cast p0, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;->getValue()Ljava/lang/CharSequence;

    move-result-object p0

    goto :goto_1

    :cond_1
    instance-of p2, p0, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    if-eqz p2, :cond_5

    check-cast p0, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;->getArgs()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v0

    invoke-interface {p1, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;->getValue()I

    move-result p0

    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_2
    check-cast v2, Ljava/lang/String;

    const/4 v1, 0x1

    new-array v4, v1, [Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "%"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "$s"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    new-array v1, v1, [Ljava/lang/String;

    aput-object v2, v1, v0

    check-cast v1, [Ljava/lang/CharSequence;

    invoke-static {p0, v4, v1}, Landroid/text/TextUtils;->replace(Ljava/lang/CharSequence;[Ljava/lang/String;[Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    move v1, v3

    goto :goto_0

    :cond_3
    const-string p2, "args.foldIndexed(\n      \u2026rayOf(arg))\n            }"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p1}, LEt0;->Q()V

    return-object p0

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
