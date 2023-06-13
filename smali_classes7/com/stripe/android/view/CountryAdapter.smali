.class public final Lcom/stripe/android/view/CountryAdapter;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CountryAdapter$CountryFilter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter<",
        "Lcom/stripe/android/core/model/Country;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\n\u00a2\u0006\u0002\u0010\rJ\u0008\u0010\u0018\u001a\u00020\u0008H\u0016J\u0008\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0008H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0008H\u0016J\u0012\u0010\u001f\u001a\u00020\u00082\u0008\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010!\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u00082\u0008\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u000bH\u0016J\u001b\u0010%\u001a\u00020&2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020)0(H\u0000\u00a2\u0006\u0002\u0008*R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017\u00a8\u0006,"
    }
    d2 = {
        "Lcom/stripe/android/view/CountryAdapter;",
        "Landroid/widget/ArrayAdapter;",
        "Lcom/stripe/android/core/model/Country;",
        "context",
        "Landroid/content/Context;",
        "unfilteredCountries",
        "",
        "itemLayoutId",
        "",
        "textViewFactory",
        "Lkotlin/Function1;",
        "Landroid/view/ViewGroup;",
        "Landroid/widget/TextView;",
        "(Landroid/content/Context;Ljava/util/List;ILkotlin/jvm/functions/Function1;)V",
        "countryFilter",
        "Lcom/stripe/android/view/CountryAdapter$CountryFilter;",
        "firstItem",
        "getFirstItem$payments_core_release",
        "()Lcom/stripe/android/core/model/Country;",
        "suggestions",
        "getUnfilteredCountries$payments_core_release",
        "()Ljava/util/List;",
        "setUnfilteredCountries$payments_core_release",
        "(Ljava/util/List;)V",
        "getCount",
        "getFilter",
        "Landroid/widget/Filter;",
        "getItem",
        "i",
        "getItemId",
        "",
        "getPosition",
        "item",
        "getView",
        "Landroid/view/View;",
        "view",
        "viewGroup",
        "updateUnfilteredCountries",
        "",
        "allowedCountryCodes",
        "",
        "",
        "updateUnfilteredCountries$payments_core_release",
        "CountryFilter",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCountryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryAdapter.kt\ncom/stripe/android/view/CountryAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n766#2:151\n857#2:152\n1747#2,3:153\n858#2:156\n*S KotlinDebug\n*F\n+ 1 CountryAdapter.kt\ncom/stripe/android/view/CountryAdapter\n*L\n76#1:151\n76#1:152\n77#1:153,3\n76#1:156\n*E\n"
    }
.end annotation


# instance fields
.field private final countryFilter:Lcom/stripe/android/view/CountryAdapter$CountryFilter;

.field private suggestions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/core/model/Country;",
            ">;"
        }
    .end annotation
.end field

.field private final textViewFactory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/view/ViewGroup;",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private unfilteredCountries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/core/model/Country;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;ILkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/stripe/android/core/model/Country;",
            ">;I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/ViewGroup;",
            "+",
            "Landroid/widget/TextView;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unfilteredCountries"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textViewFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    iput-object p2, p0, Lcom/stripe/android/view/CountryAdapter;->unfilteredCountries:Ljava/util/List;

    iput-object p4, p0, Lcom/stripe/android/view/CountryAdapter;->textViewFactory:Lkotlin/jvm/functions/Function1;

    new-instance p2, Lcom/stripe/android/view/CountryAdapter$CountryFilter;

    iget-object p3, p0, Lcom/stripe/android/view/CountryAdapter;->unfilteredCountries:Ljava/util/List;

    instance-of p4, p1, Landroid/app/Activity;

    if-eqz p4, :cond_0

    check-cast p1, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p2, p3, p0, p1}, Lcom/stripe/android/view/CountryAdapter$CountryFilter;-><init>(Ljava/util/List;Lcom/stripe/android/view/CountryAdapter;Landroid/app/Activity;)V

    iput-object p2, p0, Lcom/stripe/android/view/CountryAdapter;->countryFilter:Lcom/stripe/android/view/CountryAdapter$CountryFilter;

    iget-object p1, p0, Lcom/stripe/android/view/CountryAdapter;->unfilteredCountries:Ljava/util/List;

    iput-object p1, p0, Lcom/stripe/android/view/CountryAdapter;->suggestions:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/List;ILkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    sget p3, Lcom/stripe/android/R$layout;->country_text_view:I

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/view/CountryAdapter;-><init>(Landroid/content/Context;Ljava/util/List;ILkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$setSuggestions$p(Lcom/stripe/android/view/CountryAdapter;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CountryAdapter;->suggestions:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CountryAdapter;->suggestions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CountryAdapter;->countryFilter:Lcom/stripe/android/view/CountryAdapter$CountryFilter;

    return-object v0
.end method

.method public final synthetic getFirstItem$payments_core_release()Lcom/stripe/android/core/model/Country;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CountryAdapter;->getItem(I)Lcom/stripe/android/core/model/Country;

    move-result-object v0

    return-object v0
.end method

.method public getItem(I)Lcom/stripe/android/core/model/Country;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CountryAdapter;->suggestions:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/Country;

    return-object p1
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryAdapter;->getItem(I)Lcom/stripe/android/core/model/Country;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryAdapter;->getItem(I)Lcom/stripe/android/core/model/Country;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->hashCode()I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method

.method public getPosition(Lcom/stripe/android/core/model/Country;)I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CountryAdapter;->suggestions:Ljava/util/List;

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->indexOf(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getPosition(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/stripe/android/core/model/Country;

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryAdapter;->getPosition(Lcom/stripe/android/core/model/Country;)I

    move-result p1

    return p1
.end method

.method public final getUnfilteredCountries$payments_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/core/model/Country;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/CountryAdapter;->unfilteredCountries:Ljava/util/List;

    return-object v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    const-string v0, "viewGroup"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    check-cast p2, Landroid/widget/TextView;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/stripe/android/view/CountryAdapter;->textViewFactory:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    :goto_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryAdapter;->getItem(I)Lcom/stripe/android/core/model/Country;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method

.method public final setUnfilteredCountries$payments_core_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/core/model/Country;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CountryAdapter;->unfilteredCountries:Ljava/util/List;

    return-void
.end method

.method public final updateUnfilteredCountries$payments_core_release(Ljava/util/Set;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "allowedCountryCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CountryAdapter;->unfilteredCountries:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/stripe/android/core/model/Country;

    invoke-virtual {v5}, Lcom/stripe/android/core/model/Country;->component1()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v5

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_3

    :cond_2
    move v4, v1

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v5}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8, v4}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_4

    :goto_1
    if-eqz v4, :cond_1

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    iput-object v2, p0, Lcom/stripe/android/view/CountryAdapter;->unfilteredCountries:Ljava/util/List;

    iget-object p1, p0, Lcom/stripe/android/view/CountryAdapter;->countryFilter:Lcom/stripe/android/view/CountryAdapter$CountryFilter;

    invoke-virtual {p1, v2}, Lcom/stripe/android/view/CountryAdapter$CountryFilter;->setUnfilteredCountries(Ljava/util/List;)V

    iget-object p1, p0, Lcom/stripe/android/view/CountryAdapter;->unfilteredCountries:Ljava/util/List;

    iput-object p1, p0, Lcom/stripe/android/view/CountryAdapter;->suggestions:Ljava/util/List;

    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return v4
.end method
