.class public final LMM5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements LFP5;
.implements Lkotlin/jvm/internal/markers/KMutableList;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMM5$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/List<",
        "TT;>;",
        "LFP5;",
        "Lkotlin/jvm/internal/markers/KMutableList;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010)\n\u0002\u0008\u0002\n\u0002\u0010+\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u00016B\u0007\u00a2\u0006\u0004\u0008@\u0010<J\"\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0016\u0010\u0011\u001a\u00020\u00052\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0018\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000c\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0008\u0010\u0018\u001a\u00020\u0005H\u0016J\u000f\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0002J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000c\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u0017J\u000e\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001cH\u0016J\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u001e\u0010 \u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0016J\u0017\u0010!\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008!\u0010\u000eJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000c\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u001e\u0010#\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0016\u0010#\u001a\u00020\u00052\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0008\u0010$\u001a\u00020\nH\u0016J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008%\u0010\u000eJ\u0016\u0010&\u001a\u00020\u00052\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0017\u0010\'\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\'\u0010\u0015J\u0016\u0010(\u001a\u00020\u00052\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J \u0010)\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000c\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008)\u0010*J\u0016\u0010+\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012J-\u0010.\u001a\u00020\u00122\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008.\u0010/R$\u00105\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00088\u0016@RX\u0096\u000e\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104R\u0014\u00108\u001a\u00020\u00128@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u00107R \u0010=\u001a\u0008\u0012\u0004\u0012\u00028\u0000098@X\u0080\u0004\u00a2\u0006\u000c\u0012\u0004\u0008;\u0010<\u001a\u0004\u00081\u0010:R\u0014\u0010?\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008>\u00107\u00a8\u0006A"
    }
    d2 = {
        "LMM5;",
        "T",
        "",
        "LFP5;",
        "Lkotlin/Function1;",
        "",
        "block",
        "j",
        "LHP5;",
        "value",
        "",
        "c",
        "element",
        "contains",
        "(Ljava/lang/Object;)Z",
        "",
        "elements",
        "containsAll",
        "",
        "index",
        "get",
        "(I)Ljava/lang/Object;",
        "indexOf",
        "(Ljava/lang/Object;)I",
        "isEmpty",
        "",
        "iterator",
        "lastIndexOf",
        "",
        "listIterator",
        "fromIndex",
        "toIndex",
        "subList",
        "add",
        "(ILjava/lang/Object;)V",
        "addAll",
        "clear",
        "remove",
        "removeAll",
        "o",
        "retainAll",
        "set",
        "(ILjava/lang/Object;)Ljava/lang/Object;",
        "s",
        "start",
        "end",
        "u",
        "(Ljava/util/Collection;II)I",
        "<set-?>",
        "b",
        "LHP5;",
        "h",
        "()LHP5;",
        "firstStateRecord",
        "a",
        "()I",
        "modification",
        "LMM5$a;",
        "()LMM5$a;",
        "getReadable$runtime_release$annotations",
        "()V",
        "readable",
        "f",
        "size",
        "<init>",
        "runtime_release"
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
        "SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n153#1:458\n189#1,6:460\n195#1:467\n153#1:468\n196#1,9:470\n149#1:479\n205#1,6:485\n214#1,6:494\n185#1,10:500\n195#1:511\n153#1:512\n196#1,9:514\n149#1:523\n205#1,6:529\n214#1,6:538\n186#1:544\n189#1,6:545\n195#1:552\n153#1:553\n196#1,9:555\n149#1:564\n205#1,6:570\n214#1,6:579\n149#1:585\n189#1,6:596\n195#1:603\n153#1:604\n196#1,9:606\n149#1:615\n205#1,6:621\n214#1,6:630\n189#1,6:636\n195#1:643\n153#1:644\n196#1,9:646\n149#1:655\n205#1,6:661\n214#1,6:670\n185#1,10:677\n195#1:688\n153#1:689\n196#1,9:691\n149#1:700\n205#1,6:706\n214#1,6:715\n186#1:721\n185#1,10:722\n195#1:733\n153#1:734\n196#1,9:736\n149#1:745\n205#1,6:751\n214#1,6:760\n186#1:766\n159#1,4:767\n163#1:772\n153#1:773\n164#1,7:775\n149#1:782\n171#1,6:788\n179#1,3:797\n159#1,4:800\n163#1:805\n153#1:806\n164#1,7:808\n149#1:815\n171#1,6:821\n179#1,3:830\n153#1:833\n159#1,4:845\n163#1:850\n153#1:851\n164#1,7:853\n149#1:860\n171#1,6:866\n179#1,3:875\n153#1:879\n149#1:881\n189#1,6:892\n195#1:899\n153#1:900\n196#1,9:902\n149#1:911\n205#1,6:917\n214#1,6:926\n153#1:933\n149#1:935\n2180#2:459\n2180#2:469\n2073#2,2:480\n1686#2:482\n2075#2,2:483\n2077#2,3:491\n2180#2:513\n2073#2,2:524\n1686#2:526\n2075#2,2:527\n2077#2,3:535\n2180#2:554\n2073#2,2:565\n1686#2:567\n2075#2,2:568\n2077#2,3:576\n2073#2,2:586\n1686#2:588\n2075#2,2:590\n2077#2,3:593\n2180#2:605\n2073#2,2:616\n1686#2:618\n2075#2,2:619\n2077#2,3:627\n2180#2:645\n2073#2,2:656\n1686#2:658\n2075#2,2:659\n2077#2,3:667\n2180#2:690\n2073#2,2:701\n1686#2:703\n2075#2,2:704\n2077#2,3:712\n2180#2:735\n2073#2,2:746\n1686#2:748\n2075#2,2:749\n2077#2,3:757\n2180#2:774\n2073#2,2:783\n1686#2:785\n2075#2,2:786\n2077#2,3:794\n2180#2:807\n2073#2,2:816\n1686#2:818\n2075#2,2:819\n2077#2,3:827\n2180#2:834\n2073#2,2:835\n1686#2:837\n2075#2,5:839\n2180#2:844\n2180#2:852\n2073#2,2:861\n1686#2:863\n2075#2,2:864\n2077#2,3:872\n2180#2:880\n2073#2,2:882\n1686#2:884\n2075#2,2:886\n2077#2,3:889\n2180#2:901\n2073#2,2:912\n1686#2:914\n2075#2,2:915\n2077#2,3:923\n2180#2:934\n2073#2,2:936\n1686#2:938\n2075#2,2:940\n2077#2,3:943\n70#3:466\n70#3:510\n70#3:551\n70#3:589\n70#3:592\n70#3:602\n70#3:642\n70#3:687\n70#3:732\n70#3:771\n70#3:804\n70#3:838\n70#3:849\n70#3:878\n70#3:885\n70#3:888\n70#3:898\n70#3:932\n70#3:939\n70#3:942\n1#4:676\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n62#1:458\n101#1:460,6\n101#1:467\n101#1:468\n101#1:470,9\n101#1:479\n101#1:485,6\n101#1:494,6\n102#1:500,10\n102#1:511\n102#1:512\n102#1:514,9\n102#1:523\n102#1:529,6\n102#1:538,6\n102#1:544\n107#1:545,6\n107#1:552\n107#1:553\n107#1:555,9\n107#1:564\n107#1:570,6\n107#1:579,6\n109#1:585\n116#1:596,6\n116#1:603\n116#1:604\n116#1:606,9\n116#1:615\n116#1:621,6\n116#1:630,6\n117#1:636,6\n117#1:643\n117#1:644\n117#1:646,9\n117#1:655\n117#1:661,6\n117#1:670,6\n118#1:677,10\n118#1:688\n118#1:689\n118#1:691,9\n118#1:700\n118#1:706,6\n118#1:715,6\n118#1:721\n121#1:722,10\n121#1:733\n121#1:734\n121#1:736,9\n121#1:745\n121#1:751,6\n121#1:760,6\n121#1:766\n125#1:767,4\n125#1:772\n125#1:773\n125#1:775,7\n125#1:782\n125#1:788,6\n125#1:797,3\n132#1:800,4\n132#1:805\n132#1:806\n132#1:808,7\n132#1:815\n132#1:821,6\n132#1:830,3\n145#1:833\n155#1:845,4\n155#1:850\n155#1:851\n155#1:853,7\n155#1:860\n155#1:866,6\n155#1:875,3\n163#1:879\n170#1:881\n185#1:892,6\n185#1:899\n185#1:900\n185#1:902,9\n185#1:911\n185#1:917,6\n185#1:926,6\n195#1:933\n204#1:935\n62#1:459\n101#1:469\n101#1:480,2\n101#1:482\n101#1:483,2\n101#1:491,3\n102#1:513\n102#1:524,2\n102#1:526\n102#1:527,2\n102#1:535,3\n107#1:554\n107#1:565,2\n107#1:567\n107#1:568,2\n107#1:576,3\n109#1:586,2\n109#1:588\n109#1:590,2\n109#1:593,3\n116#1:605\n116#1:616,2\n116#1:618\n116#1:619,2\n116#1:627,3\n117#1:645\n117#1:656,2\n117#1:658\n117#1:659,2\n117#1:667,3\n118#1:690\n118#1:701,2\n118#1:703\n118#1:704,2\n118#1:712,3\n121#1:735\n121#1:746,2\n121#1:748\n121#1:749,2\n121#1:757,3\n125#1:774\n125#1:783,2\n125#1:785\n125#1:786,2\n125#1:794,3\n132#1:807\n132#1:816,2\n132#1:818\n132#1:819,2\n132#1:827,3\n145#1:834\n149#1:835,2\n149#1:837\n149#1:839,5\n153#1:844\n155#1:852\n155#1:861,2\n155#1:863\n155#1:864,2\n155#1:872,3\n163#1:880\n170#1:882,2\n170#1:884\n170#1:886,2\n170#1:889,3\n185#1:901\n185#1:912,2\n185#1:914\n185#1:915,2\n185#1:923,3\n195#1:934\n204#1:936,2\n204#1:938\n204#1:940,2\n204#1:943,3\n101#1:466\n102#1:510\n107#1:551\n109#1:589\n110#1:592\n116#1:602\n117#1:642\n118#1:687\n121#1:732\n125#1:771\n132#1:804\n149#1:838\n155#1:849\n162#1:878\n170#1:885\n171#1:888\n185#1:898\n194#1:932\n204#1:939\n205#1:942\n*E\n"
    }
.end annotation


# instance fields
.field public b:LHP5;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LMM5$a;

    invoke-static {}, LMi1;->b()LER3;

    move-result-object v1

    invoke-direct {v0, v1}, LMM5$a;-><init>(LER3;)V

    iput-object v0, p0, LMM5;->b:LHP5;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LMM5$a;

    invoke-static {v0}, LxM5;->B(LHP5;)LHP5;

    move-result-object v0

    check-cast v0, LMM5$a;

    invoke-virtual {v0}, LMM5$a;->h()I

    move-result v0

    return v0
.end method

.method public add(ILjava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    :cond_0
    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {v1}, LxM5;->B(LHP5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v2

    invoke-virtual {v1}, LMM5$a;->g()LER3;

    move-result-object v1

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, p1, p2}, LER3;->add(ILjava/lang/Object;)LER3;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    :try_start_1
    sget-object v4, LsM5;->e:LsM5$a;

    invoke-virtual {v4}, LsM5$a;->b()LsM5;

    move-result-object v4

    invoke-static {v1, p0, v4}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v6

    if-ne v6, v2, :cond_2

    invoke-virtual {v1, v0}, LMM5$a;->i(LER3;)V

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v0

    const/4 v2, 0x1

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, LMM5$a;->j(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v3

    invoke-static {v4, p0}, LxM5;->M(LsM5;LFP5;)V

    if-eqz v2, :cond_0

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v5

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v3

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    :cond_0
    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {v1}, LxM5;->B(LHP5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v2

    invoke-virtual {v1}, LMM5$a;->g()LER3;

    move-result-object v1

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, LER3;->add(Ljava/lang/Object;)LER3;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, LsM5;->e:LsM5$a;

    invoke-virtual {v5}, LsM5$a;->b()LsM5;

    move-result-object v5

    invoke-static {v1, p0, v5}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    invoke-virtual {v1, v0}, LMM5$a;->i(LER3;)V

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, LMM5$a;->j(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v8

    :cond_2
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, LxM5;->M(LsM5;LFP5;)V

    if-eqz v3, :cond_0

    move v3, v8

    :goto_0
    return v3

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TT;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LMM5$b;

    invoke-direct {v0, p1, p2}, LMM5$b;-><init>(ILjava/util/Collection;)V

    invoke-virtual {p0, v0}, LMM5;->j(Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TT;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {v1}, LxM5;->B(LHP5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v2

    invoke-virtual {v1}, LMM5$a;->g()LER3;

    move-result-object v1

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, LER3;->addAll(Ljava/util/Collection;)LER3;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, LsM5;->e:LsM5$a;

    invoke-virtual {v5}, LsM5$a;->b()LsM5;

    move-result-object v5

    invoke-static {v1, p0, v5}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    invoke-virtual {v1, v0}, LMM5$a;->i(LER3;)V

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, LMM5$a;->j(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v8

    :cond_2
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, LxM5;->M(LsM5;LFP5;)V

    if-eqz v3, :cond_0

    move v3, v8

    :goto_0
    return v3

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final b()LMM5$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LMM5$a<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LMM5$a;

    invoke-static {v0, p0}, LxM5;->S(LHP5;LFP5;)LHP5;

    move-result-object v0

    check-cast v0, LMM5$a;

    return-object v0
.end method

.method public c(LHP5;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v0

    invoke-virtual {p1, v0}, LHP5;->e(LHP5;)V

    check-cast p1, LMM5$a;

    iput-object p1, p0, LMM5;->b:LHP5;

    return-void
.end method

.method public clear()V
    .locals 5

    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LMM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    sget-object v2, LsM5;->e:LsM5$a;

    invoke-virtual {v2}, LsM5$a;->b()LsM5;

    move-result-object v2

    invoke-static {v0, p0, v2}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v0

    check-cast v0, LMM5$a;

    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {}, LMi1;->b()LER3;

    move-result-object v4

    invoke-virtual {v0, v4}, LMM5$a;->i(LER3;)V

    invoke-virtual {v0}, LMM5$a;->h()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v4}, LMM5$a;->j(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    invoke-static {v2, p0}, LxM5;->M(LsM5;LFP5;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v3

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, LMM5;->b()LMM5$a;

    move-result-object v0

    invoke-virtual {v0}, LMM5$a;->g()LER3;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LMM5;->b()LMM5$a;

    move-result-object v0

    invoke-virtual {v0}, LMM5$a;->g()LER3;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public f()I
    .locals 1

    invoke-virtual {p0}, LMM5;->b()LMM5$a;

    move-result-object v0

    invoke-virtual {v0}, LMM5$a;->g()LER3;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, LMM5;->b()LMM5$a;

    move-result-object v0

    invoke-virtual {v0}, LMM5$a;->g()LER3;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h()LHP5;
    .locals 1

    iget-object v0, p0, LMM5;->b:LHP5;

    return-object v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, LMM5;->b()LMM5$a;

    move-result-object v0

    invoke-virtual {v0}, LMM5$a;->g()LER3;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, LMM5;->b()LMM5$a;

    move-result-object v0

    invoke-virtual {v0}, LMM5$a;->g()LER3;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, LMM5;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    return-object v0
.end method

.method public final j(Lkotlin/jvm/functions/Function1;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    :cond_0
    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {v1}, LxM5;->B(LHP5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v2

    invoke-virtual {v1}, LMM5$a;->g()LER3;

    move-result-object v1

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1}, LER3;->builder()LER3$a;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, LER3$a;->build()LER3;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, LsM5;->e:LsM5$a;

    invoke-virtual {v5}, LsM5$a;->b()LsM5;

    move-result-object v5

    invoke-static {v1, p0, v5}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v7

    if-ne v7, v2, :cond_1

    invoke-virtual {v1, v0}, LMM5$a;->i(LER3;)V

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v0

    const/4 v2, 0x1

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, LMM5$a;->j(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, LxM5;->M(LsM5;LFP5;)V

    if-eqz v2, :cond_0

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1

    :cond_2
    :goto_1
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, LMM5;->b()LMM5$a;

    move-result-object v0

    invoke-virtual {v0}, LMM5$a;->g()LER3;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LzP5;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LzP5;-><init>(LMM5;I)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LzP5;

    invoke-direct {v0, p0, p1}, LzP5;-><init>(LMM5;I)V

    return-object v0
.end method

.method public o(I)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LMM5;->get(I)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LMM5$a;

    invoke-static {v2}, LxM5;->B(LHP5;)LHP5;

    move-result-object v2

    check-cast v2, LMM5$a;

    invoke-virtual {v2}, LMM5$a;->h()I

    move-result v3

    invoke-virtual {v2}, LMM5$a;->g()LER3;

    move-result-object v2

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, LER3;->U1(I)LER3;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LMM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, LsM5;->e:LsM5$a;

    invoke-virtual {v5}, LsM5$a;->b()LsM5;

    move-result-object v5

    invoke-static {v2, p0, v5}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v2

    check-cast v2, LMM5$a;

    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, LMM5$a;->h()I

    move-result v7

    if-ne v7, v3, :cond_2

    invoke-virtual {v2, v1}, LMM5$a;->i(LER3;)V

    invoke-virtual {v2}, LMM5$a;->h()I

    move-result v1

    const/4 v3, 0x1

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, LMM5$a;->j(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, LxM5;->M(LsM5;LFP5;)V

    if-eqz v3, :cond_0

    :goto_1
    return-object v0

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final bridge remove(I)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LMM5;->o(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 9

    :cond_0
    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {v1}, LxM5;->B(LHP5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v2

    invoke-virtual {v1}, LMM5$a;->g()LER3;

    move-result-object v1

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, LER3;->remove(Ljava/lang/Object;)LER3;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, LsM5;->e:LsM5$a;

    invoke-virtual {v5}, LsM5$a;->b()LsM5;

    move-result-object v5

    invoke-static {v1, p0, v5}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    invoke-virtual {v1, v0}, LMM5$a;->i(LER3;)V

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, LMM5$a;->j(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v8

    :cond_2
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, LxM5;->M(LsM5;LFP5;)V

    if-eqz v3, :cond_0

    move v3, v8

    :goto_0
    return v3

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {v1}, LxM5;->B(LHP5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v2

    invoke-virtual {v1}, LMM5$a;->g()LER3;

    move-result-object v1

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, LER3;->removeAll(Ljava/util/Collection;)LER3;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, LsM5;->e:LsM5$a;

    invoke-virtual {v5}, LsM5$a;->b()LsM5;

    move-result-object v5

    invoke-static {v1, p0, v5}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    invoke-virtual {v1, v0}, LMM5$a;->i(LER3;)V

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, LMM5$a;->j(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v8

    :cond_2
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, LxM5;->M(LsM5;LFP5;)V

    if-eqz v3, :cond_0

    move v3, v8

    :goto_0
    return v3

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LMM5$c;

    invoke-direct {v0, p1}, LMM5$c;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, LMM5;->j(Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    return p1
.end method

.method public final s(II)V
    .locals 7

    :cond_0
    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {v1}, LxM5;->B(LHP5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v2

    invoke-virtual {v1}, LMM5$a;->g()LER3;

    move-result-object v1

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1}, LER3;->builder()LER3$a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->clear()V

    invoke-interface {v0}, LER3$a;->build()LER3;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LMM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    :try_start_1
    sget-object v4, LsM5;->e:LsM5$a;

    invoke-virtual {v4}, LsM5$a;->b()LsM5;

    move-result-object v4

    invoke-static {v1, p0, v4}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v1

    check-cast v1, LMM5$a;

    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v6

    if-ne v6, v2, :cond_1

    invoke-virtual {v1, v0}, LMM5$a;->i(LER3;)V

    invoke-virtual {v1}, LMM5$a;->h()I

    move-result v0

    const/4 v2, 0x1

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, LMM5$a;->j(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v3

    invoke-static {v4, p0}, LxM5;->M(LsM5;LFP5;)V

    if-eqz v2, :cond_0

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v5

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v3

    throw p1

    :cond_2
    :goto_1
    return-void

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LMM5;->get(I)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LMM5$a;

    invoke-static {v2}, LxM5;->B(LHP5;)LHP5;

    move-result-object v2

    check-cast v2, LMM5$a;

    invoke-virtual {v2}, LMM5$a;->h()I

    move-result v3

    invoke-virtual {v2}, LMM5$a;->g()LER3;

    move-result-object v2

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, p1, p2}, LER3;->set(ILjava/lang/Object;)LER3;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LMM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, LsM5;->e:LsM5$a;

    invoke-virtual {v5}, LsM5$a;->b()LsM5;

    move-result-object v5

    invoke-static {v2, p0, v5}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v2

    check-cast v2, LMM5$a;

    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, LMM5$a;->h()I

    move-result v7

    if-ne v7, v3, :cond_2

    invoke-virtual {v2, v1}, LMM5$a;->i(LER3;)V

    invoke-virtual {v2}, LMM5$a;->h()I

    move-result v1

    const/4 v3, 0x1

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, LMM5$a;->j(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, LxM5;->M(LsM5;LFP5;)V

    if-eqz v3, :cond_0

    :goto_1
    return-object v0

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, LMM5;->f()I

    move-result v0

    return v0
.end method

.method public subList(II)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {p0}, LMM5;->size()I

    move-result v2

    if-gt p2, v2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-eqz v0, :cond_2

    new-instance v0, LWS5;

    invoke-direct {v0, p0, p1, p2}, LWS5;-><init>(LMM5;II)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/CollectionToArray;->toArray(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lkotlin/jvm/internal/CollectionToArray;->toArray(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final u(Ljava/util/Collection;II)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TT;>;II)I"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LMM5;->size()I

    move-result v0

    :cond_0
    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LMM5$a;

    invoke-static {v2}, LxM5;->B(LHP5;)LHP5;

    move-result-object v2

    check-cast v2, LMM5$a;

    invoke-virtual {v2}, LMM5$a;->h()I

    move-result v3

    invoke-virtual {v2}, LMM5$a;->g()LER3;

    move-result-object v2

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2}, LER3;->builder()LER3$a;

    move-result-object v1

    invoke-interface {v1, p2, p3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, p1}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    invoke-interface {v1}, LER3$a;->build()LER3;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, LMM5;->h()LHP5;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LMM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, LsM5;->e:LsM5$a;

    invoke-virtual {v5}, LsM5$a;->b()LsM5;

    move-result-object v5

    invoke-static {v2, p0, v5}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v2

    check-cast v2, LMM5$a;

    invoke-static {}, LNM5;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, LMM5$a;->h()I

    move-result v7

    if-ne v7, v3, :cond_1

    invoke-virtual {v2, v1}, LMM5$a;->i(LER3;)V

    invoke-virtual {v2}, LMM5$a;->h()I

    move-result v1

    const/4 v3, 0x1

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, LMM5$a;->j(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, LxM5;->M(LsM5;LFP5;)V

    if-eqz v3, :cond_0

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1

    :cond_2
    :goto_1
    invoke-virtual {p0}, LMM5;->size()I

    move-result p1

    sub-int/2addr v0, p1

    return v0

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method
