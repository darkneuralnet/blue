.class public final LLS1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "LLS1;",
        "LF6;",
        "LG6;",
        "adapterItem",
        "",
        "b",
        "oldItem",
        "newItem",
        "",
        "c",
        "<init>",
        "()V",
        "co.bird.android.feature.identification"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdentificationAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationAdapterDiff.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,49:1\n18#2:50\n18#2:55\n18#2:60\n18#2:65\n18#2:70\n18#2:75\n18#2:80\n18#2:85\n18#2:90\n18#2:95\n9#3,4:51\n9#3,4:56\n9#3,4:61\n9#3,4:66\n9#3,4:71\n9#3,4:76\n9#3,4:81\n9#3,4:86\n9#3,4:91\n9#3,4:96\n*S KotlinDebug\n*F\n+ 1 IdentificationAdapterDiff.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapterDiff\n*L\n16#1:50\n17#1:55\n19#1:60\n20#1:65\n21#1:70\n22#1:75\n30#1:80\n34#1:85\n38#1:90\n42#1:95\n16#1:51,4\n17#1:56,4\n19#1:61,4\n20#1:66,4\n21#1:71,4\n22#1:76,4\n30#1:81,4\n34#1:86,4\n38#1:91,4\n42#1:96,4\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/h$e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;",
            "Ljava/util/List<",
            "LH6;",
            ">;)",
            "Landroidx/recyclerview/widget/h$e;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LF6$a;->a(LF6;Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/h$e;

    move-result-object p1

    return-object p1
.end method

.method public b(LG6;)Ljava/lang/String;
    .locals 5

    const-string v0, "adapterItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->b()I

    move-result v0

    sget v1, Lhj4;->item_selector:I

    const-string v2, ""

    const/4 v3, 0x0

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LhW1;

    if-eqz v0, :cond_0

    move-object v3, p1

    :cond_0
    check-cast v3, LhW1;

    if-eqz v3, :cond_13

    invoke-virtual {v3}, LhW1;->e()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto/16 :goto_4

    :cond_1
    move-object v2, p1

    goto/16 :goto_4

    :cond_2
    sget v1, Lhj4;->item_manual_entry_selector:I

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LnU1;

    if-eqz v0, :cond_3

    move-object v3, p1

    :cond_3
    check-cast v3, LnU1;

    if-eqz v3, :cond_13

    invoke-virtual {v3}, LnU1;->e()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto/16 :goto_4

    :cond_4
    sget v1, Lhj4;->item_selector_header:I

    const/4 v4, 0x1

    if-ne v0, v1, :cond_5

    :goto_0
    move v1, v4

    goto :goto_1

    :cond_5
    sget v1, Lhj4;->item_debug_header:I

    if-ne v0, v1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_a

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_7

    instance-of v4, p1, Ljava/lang/String;

    :cond_7
    if-eqz v4, :cond_8

    move-object v3, p1

    :cond_8
    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_9

    goto :goto_4

    :cond_9
    move-object v2, v3

    goto :goto_4

    :cond_a
    sget v1, Lhj4;->item_debug:I

    if-ne v0, v1, :cond_d

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LhT1;

    if-eqz v0, :cond_b

    goto :goto_2

    :cond_b
    move-object p1, v3

    :goto_2
    check-cast p1, LhT1;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, LhT1;->d()LgT1;

    move-result-object v3

    :cond_c
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_d
    sget v1, Lhj4;->item_form_edit_text:I

    if-ne v0, v1, :cond_10

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_e

    instance-of v4, p1, Ljava/lang/String;

    :cond_e
    if-eqz v4, :cond_f

    move-object v3, p1

    :cond_f
    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_9

    goto :goto_4

    :cond_10
    sget v1, Lhj4;->item_document_type:I

    if-ne v0, v1, :cond_13

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LhW1;

    if-eqz v0, :cond_11

    goto :goto_3

    :cond_11
    move-object p1, v3

    :goto_3
    check-cast p1, LhW1;

    if-eqz p1, :cond_12

    invoke-virtual {p1}, LhW1;->f()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lkotlin/Pair;

    :cond_12
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_13
    :goto_4
    return-object v2
.end method

.method public c(LG6;LG6;)Z
    .locals 4

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LnU1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LnU1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    check-cast p2, LnU1;

    check-cast p1, LnU1;

    invoke-virtual {p1}, LnU1;->f()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LnU1;->f()Ljava/lang/Object;

    move-result-object v1

    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v2, :cond_2

    move p1, v2

    goto :goto_1

    :cond_2
    move p1, v3

    :goto_1
    if-nez p1, :cond_e

    goto/16 :goto_7

    :cond_3
    instance-of v0, p1, LlT1;

    if-eqz v0, :cond_7

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LlT1;

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    move-object p2, v1

    :goto_2
    check-cast p2, LlT1;

    check-cast p1, LlT1;

    invoke-virtual {p1}, LlT1;->e()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_6

    if-eqz p2, :cond_5

    invoke-virtual {p2}, LlT1;->e()Ljava/lang/Object;

    move-result-object v1

    :cond_5
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v2, :cond_6

    move p1, v2

    goto :goto_3

    :cond_6
    move p1, v3

    :goto_3
    if-nez p1, :cond_e

    goto :goto_7

    :cond_7
    instance-of v0, p1, LhW1;

    if-eqz v0, :cond_b

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LhW1;

    if-eqz v0, :cond_8

    goto :goto_4

    :cond_8
    move-object p2, v1

    :goto_4
    check-cast p2, LhW1;

    check-cast p1, LhW1;

    invoke-virtual {p1}, LhW1;->f()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_a

    if-eqz p2, :cond_9

    invoke-virtual {p2}, LhW1;->f()Ljava/lang/Object;

    move-result-object v1

    :cond_9
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v2, :cond_a

    move p1, v2

    goto :goto_5

    :cond_a
    move p1, v3

    :goto_5
    if-nez p1, :cond_e

    goto :goto_7

    :cond_b
    instance-of v0, p1, LhT1;

    if-eqz v0, :cond_e

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LhT1;

    if-eqz v0, :cond_c

    goto :goto_6

    :cond_c
    move-object p2, v1

    :goto_6
    check-cast p2, LhT1;

    check-cast p1, LhT1;

    invoke-virtual {p1}, LhT1;->d()LgT1;

    move-result-object p1

    if-eqz p2, :cond_d

    invoke-virtual {p2}, LhT1;->d()LgT1;

    move-result-object v1

    :cond_d
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_7

    :cond_e
    move v2, v3

    :goto_7
    return v2
.end method
